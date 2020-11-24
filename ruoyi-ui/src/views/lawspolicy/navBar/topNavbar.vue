<template>
  <el-menu :default-active="activeIndex" class="el-menu-demo breadcrumb-container" style="margin-left: 80px" mode="horizontal"
           @select="handleSelect">
    <el-menu-item index="1" @click="moneyClick">经费使用</el-menu-item>
    <el-menu-item index="2" @click="aidClick">救助政策</el-menu-item>
    <el-menu-item index="3">教代会相关</el-menu-item>
    <el-menu-item index="4">劳模相关</el-menu-item>
    <el-menu-item index="5">其他法律政策文件</el-menu-item>
  </el-menu>


</template>

<script>
    export default {
        name: "topNavbar",
      data() {
        return {
          activeIndex: '1',
        };
      },
      methods: {
        handleSelect(key, keyPath) {
          console.log(key, keyPath);
        },
        moneyClick:function () {
          this.$router.push('lawsIndex/useMoney')
        },
        aidClick:function () {
          this.$router.push('lawsIndex/aidPolicy')
        }
      }
    }
</script>

<style scoped>

</style>
