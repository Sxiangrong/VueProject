<template>
    <div>
      <el-table :data="userData" stripe style="width: 100%;margin-top: 40px;" class="tableCss" >
        <el-table-column prop="id" label="序号" width="100px"></el-table-column>
        <el-table-column prop="userName" label="用户名" width="450px"></el-table-column>
        <el-table-column prop="userRole" label="角色" width="250px"></el-table-column>
        <el-table-column prop="operate" label="操作" width="400px">
          <template  slot-scope="scope">
            <el-button type="text" v-if="scope.row.userName!=''" >重置密码</el-button>
          </template>
        </el-table-column>
      </el-table>
    </div>
</template>

<script>
    export default {
        name: "specialuser",
      data(){
          return{
            userData:[
              {
                id:1,
                userName:'数据信息中心',
                userRole:'财务中心',
                operate:''
              },
              {
                id:2,
                userName:'河西区教育中心',
                userRole:'管理员',
                operate:''
              },
              {
                id:3,
                userName:'',
                userRole:'',
                operate:''
              },
              {
                id:4,
                userName:'',
                userRole:'',
                operate:''
              },
              {
                id:5,
                userName:'',
                userRole:'',
                operate:''
              },
              {
                id:6,
                userName:'',
                userRole:'',
                operate:''
              },
              {
                id:7,
                userName:'',
                userRole:'',
                operate:''
              },
              {
                id:8,
                userName:'',
                userRole:'',
                operate:''
              },
            ]
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
    margin-left: 50px;
  }
</style>
