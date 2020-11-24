<template>
    <div>
      <div style="width:100%">
        <el-row style="margin-top: 20px;">
          <el-col :span="2" style="padding-left: 50px">
            <el-button type="primary" icon="el-icon-plus" size="medium">新建</el-button>
          </el-col>
          <el-col :span="2" style="padding-left: 40px">
            <el-button type="danger" icon="el-icon-delete" size="medium">经费维护开放</el-button>
          </el-col>
          <el-col :span="20">
            <el-form :inline="true" :model="infoTable" class="el-form--inline el-col-offset-11 " >

              <el-form-item >
                <el-input v-model="infoTable.name" placeholder="请输入工会名称">
                </el-input>
              </el-form-item>

              <el-form-item>
                <el-button type="primary" >查询</el-button>
              </el-form-item>
            </el-form>
          </el-col>

        </el-row>
        <el-row>
          <el-table :data="infOTableData" stripe style="width: 100%;" class="tableCss">
            <el-table-column prop="id" label="序号" width="100px"></el-table-column>
            <el-table-column prop="laborUnion" label="工会名称" width="300px"></el-table-column>
            <el-table-column prop="chairman" label="工会主席" width="100px"></el-table-column>
            <el-table-column prop="laborMoney" label="当年工会经费" width="150px"></el-table-column>
            <el-table-column prop="laborUsedMoney" label="当年已用经费" width="150px"></el-table-column>
            <el-table-column prop="operate" label="操作" width="400px" style="text-align: center;margin: auto;padding: 0;">
              <template  slot-scope="scope">
                <el-button type="text" v-if="scope.row.laborMoney!=''" >详情</el-button>
                <el-button type="text" v-if="scope.row.laborMoney!=''">编辑</el-button>
                <el-button type="text" v-if="scope.row.laborMoney!=''">经费维护</el-button>
                <el-button type="text" v-if="scope.row.laborMoney!=''" >账目信息</el-button>
                <el-button type="text" v-if="scope.row.laborMoney!=''">统计报表</el-button>
                <el-button type="text" v-if="scope.row.laborMoney!=''">操作日志</el-button>
              </template>
            </el-table-column>
          </el-table>
        </el-row>
      </div>
    </div>
</template>

<script>
    export default {
        name: "info",
      data(){
          return{
            infoTable:{
              name:''
            },
            infOTableData:[
              {
                id:1,
                laborUnion:'梅江道小学',
                chairman:'张浩',
                laborMoney:'30000',
                laborUsedMoney:'15000',
                operate:''
              }, {
                id:2,
                laborUnion:'天津市小学',
                chairman:'东华',
                laborMoney:'30000',
                laborUsedMoney:'10000',
                operate:''
              },
              {
                id:3,
                laborUnion:'',
                chairman:'',
                laborMoney:'',
                laborUsedMoney:'',
                operate:''
              }, {
                id:4,
                laborUnion:'',
                chairman:'',
                laborMoney:'',
                laborUsedMoney:'',
                operate:''
              } ,{
                id:5,
                laborUnion:'',
                chairman:'',
                laborMoney:'',
                laborUsedMoney:'',
                operate:''
              }
            ]
          }
      }
    }
</script>

<style scoped>
  el-table-column{
    text-align: center;
    margin: auto;
    padding:0;
  }
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
