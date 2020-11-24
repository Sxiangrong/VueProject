<template>
  <div style="width:100%">
    <el-table :data="fileTable" stripe style="width: 100%;">
      <el-table-column prop="id" label="序号" width="100px"></el-table-column>
      <el-table-column prop="fileName" label="文件名" width="500px"></el-table-column>
      <el-table-column prop="fileData" label="日期" width="300px"></el-table-column>
      <el-table-column prop="operate" label="操作" width="300px">
        <template  slot-scope="scope">
          <el-button type="text" v-if="scope.row.fileName!=''" >预览</el-button>
          <el-button type="text" v-if="scope.row.fileName!=''">下载</el-button>
          <el-button type="text" v-if="scope.row.fileName!=''">删除</el-button>
        </template>
      </el-table-column>
    </el-table>

  </div>
</template>

<script>
    export default {
        name: "aidPolicy",
      data(){
        return{
          fileTable:[
            {
              id:1,
              fileName:'支援武汉',
              fileData:'2020-10-23',
              operate:''
            },
            {
              id:2,
              fileName:'鼓励大学生创业',
              fileData:'2020-11-23',
              operate:''
            },{
              id:3,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:4,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:5,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:6,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:7,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:8,
              fileName:'',
              fileData:'',
              operate:''
            },{
              id:9,
              fileName:'',
              fileData:'',
              operate:''
            },

          ]
        }
      }
    }
</script>

<style scoped>

</style>
