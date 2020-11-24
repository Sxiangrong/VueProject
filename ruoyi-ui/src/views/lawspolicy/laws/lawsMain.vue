<template>
<!--  组件容器路由在这里渲染-->
  <section class="app-main">

   <keep-alive >
        <router-view :key="key" />
      </keep-alive>
  </section>

</template>

<script>

    export default {
        name: "lawsMain",
      computed: {
        key() {
          return this.$route.path
        }
      }
    }
</script>

<style scoped>

</style>
