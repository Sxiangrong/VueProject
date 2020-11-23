<template>
  <div>
    <el-row :gutter="32">
      <el-col :span="4" :xs="24" :sm="24" :lg="8" >
        <el-popover placement="right-start" width="200" trigger="hover">
          <template >
            <div><p>观影、春/秋游类</p></div>
            <div><p>生日蛋糕券</p></div>
            <div><p>节日福利</p></div>
            <div><p>恶劣天气防护</p></div>
            <div><p>文体活动类</p></div>
            <div><p>劳动竞赛</p></div>
            <div><p>其他</p></div>
          </template>
          <el-card shadow="always" class="box fontText" slot="reference">
           经费登记备案
          </el-card>
        </el-popover>
      </el-col>
      <el-col :span="4" :xs="24" :sm="24" :lg="8" >
        <el-card shadow="always" class="box fontText" >
          文件管理
        </el-card>
      </el-col>
      <el-col :span="4" :xs="24" :sm="24" :lg="8" >
        <el-card shadow="always" class="box fontText" >
          发送通知
        </el-card>
      </el-col>
    </el-row>

    <el-row :gutter="32">
      <el-col :span="4" :xs="24" :sm="24" :lg="8" v-for="(item,index) in cardText" :key="index">
        <el-card shadow="always" class="box fontText">
          {{item.content}}
        </el-card>
      </el-col>
    </el-row>
  </div>

</template>

<script>
  let cardText=[
  {
    id:1,
    content:"基层工会"
  },{
    id:2,
    content:"经费设置"
  },{
    id:3,
    content:"总工会"
  }
]

  export default {
        name: "MainContext",
        data(){
          return{
            cardText:cardText,
          }
      },

    methods:{

    }

    }
</script>

<style scoped>
 .box{
   width: 80%;
   height: 170px;
   background: inherit;
   background-color: #80b0e2;
   display: inline-block;
   margin: 30px;
   border-radius: 10px 10px  10px  10px;
   box-shadow: 8px  5px 5px #979ba3;
 }
  .fontText{
    font-family: "Arial Narrow";
    font-weight: 700;
    font-style: normal;
    font-size: 30px;
    text-align: center;
    line-height: 50%;
    color: whitesmoke;
    padding-top: 70px;
  }

  .el-card:hover{
    transform: scale(1.1,1.1);
    transition-duration:1s;
  }
 .activeDiv{
  display: inline-block;
   z-index: 999;
}

</style>
