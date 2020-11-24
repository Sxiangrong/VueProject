
<template>
  <div class="app-container" >
    <div >
      <el-row>
<!--      <top-navbar></top-navbar>-->
      <el-menu :default-active="activeIndex" class="el-menu-demo breadcrumb-container" style="margin-left: 30px" mode="horizontal"
               @select="handleSelect">
        <el-menu-item index="1" @click="moneyClick">经费使用</el-menu-item>
        <el-menu-item index="2" @click="aidClick">救助政策</el-menu-item>
        <el-menu-item index="3">教代会相关</el-menu-item>
        <el-menu-item index="4">劳模相关</el-menu-item>
        <el-menu-item index="5">其他法律政策文件</el-menu-item>
      </el-menu>

    </el-row>
    <el-row class="tableCss">
      <div v-show="show1">
        <use-money></use-money>
      </div>
      <div v-show="show2">
        <aid-policy></aid-policy>
      </div>
    </el-row>

    </div>
  </div>
</template>

<script>

  import topNavbar from "./navBar/topNavbar";
  import LawsMain from "./laws/lawsMain";
  import UseMoney from "./laws/SecContent/useMoney";
  import AidPolicy from "./laws/SecContent/aidPolicy";
    export default {
      name: "lawsIndex",
      components: {AidPolicy, UseMoney, LawsMain, topNavbar},
      data(){
        return{
          activeIndex: '1',
          show1:true,
          show2:false
        }
      },
      computed:{
          $router(){
            //本页面挂载加载时默认页
            this.$router.push('lawsIndex/useMoney')
          }
      },
      methods:{
        handleSelect(key, keyPath) {
          console.log(key, keyPath);
        },
        moneyClick:function(){
          this.show1=true;
          this.show2=false;
        },
        aidClick:function () {
          this.show1=false;
          this.show2=true;
        }
      }
    }
</script>

<style scoped>
  el-muenu el-menu-item{
    font-weight: bolder;
    font-style: italic;
    font-size: 26px;
  }
 .box{
   width: 100%;
   height: 600px;
   background-color: whitesmoke;
   box-shadow:10px 10px 10px 8px gray;
   border: #1e1e1e 2px ;


 }
  .tableCss{
    margin-left: 30px;
  }

</style>
