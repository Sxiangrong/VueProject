<template>
    <div style="width:100%" >
      <el-table :data="fileDataTable"  stripe style="width: 100%;" >
        <el-table-column prop="id" label="序号" width="100px;"></el-table-column>
          <el-table-column prop="fileName" label="文件名" width="500px;"></el-table-column>
          <el-table-column prop="fileData" label="日期" width="300px;"></el-table-column>
           <el-table-column prop="operate" label="操作" width="300px;">
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
        name: "useMoney",
      data(){
          return{
            fileDataTable:[
              {
                id:1,
                fileName:'经费使用',
                fileData:'2020-10-23',
                operate:''
              },
              {
                id:2,
                fileName:'河西区经费',
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
            ],
            showOperation:false,
          }
      },
      mounted() {
         // this.filterOperation();
      },
      methods:{
        filterOperation:function () {
          this.fileDataTable.filter(item=>{
            if(item.id==1){
              return this.showOperation=true;
            }
          })

        }
      }
    }
</script>

<style scoped>
  .litter{
    width: 100%;
    height: 100%;
  }
  .litter:nth-child(odd){
    height: 20px;
    width: 100%;
    border: 0px;
    border-bottom: 1px solid #c3c3c3;
  }

  .litter:focus,.litter:focus{
    outline: none;
  }
  .litter:nth-child(even){
    height: 20px;
    width: 100%;
    border: 0px;
    border-bottom: 1px solid #c3c3c3;
    background: #f5f7fa;

  }
</style>
