<template>
  <div>
    <div style="width:100%">
      <el-row style="margin-top: 20px;">
        <el-col :span="2" style="padding-left: 50px">
          <el-button type="primary" icon="el-icon-plus" size="medium"
            @click="handleAdd" v-hasPermi="['monitor:job:add']">新增</el-button>
        </el-col>
        <el-col :span="2" style="padding-left: 40px">
          <el-button type="danger" icon="el-icon-delete" size="medium"
            :disabled="multiple" @click="handleDelete" v-hasPermi="['monitor:job:remove']">删除</el-button>
        </el-col>
        <el-col :span="20">
          <el-form :inline="true" :model="selectTime" class="el-form--inline el-col-offset-11 " >
            <el-form-item>
              <div class="block">
                <el-date-picker
                  v-model="selectTime.time1"
                  type="datetime"
                  placeholder="选择日期时间"
                  align="right"
                  :picker-options="selectTime.pickerOptions">
                </el-date-picker>
              </div>
            </el-form-item>
            <el-form-item >
              <el-input v-model="selectTime.title1" placeholder="请输入通知标题">
              </el-input>
            </el-form-item>

            <el-form-item>
              <el-button type="primary" >查询</el-button>
            </el-form-item>
          </el-form>
        </el-col>

      </el-row>
      <el-row>
        <el-table :data="infoFile" stripe style="width: 100%;" class="tableCss"   @selection-change="changeCheckBoxValue">
          <el-table-column min-width='140' type="selection"></el-table-column>
          <el-table-column prop="id" label="序号" width="100px"></el-table-column>
          <el-table-column prop="fileTitle" label="标题" width="400px"></el-table-column>
          <el-table-column prop="fileTime" label="发送时间" width="200px"></el-table-column>
          <el-table-column prop="readNum" label="阅读量" width="200px"></el-table-column>
          <el-table-column prop="operate" label="操作" width="300px">
            <template  slot-scope="scope">
              <el-button type="text" v-if="scope.row.fileTitle!=''" >预览</el-button>
              <el-button type="text" v-if="scope.row.fileTitle!=''">下载</el-button>
              <el-button type="text" v-if="scope.row.fileTitle!=''">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </el-row>
    </div>
  </div>
</template>

<script>
    export default {
        name: "settingInfo",
      data(){
          return{
            selectTime:{
                  pickerOptions: {
                    shortcuts: [{
                      text: '今天',
                      onClick(picker) {
                        picker.$emit('pick', new Date());
                      }
                    }, {
                      text: '昨天',
                      onClick(picker) {
                        const date = new Date();
                        date.setTime(date.getTime() - 3600 * 1000 * 24);
                        picker.$emit('pick', date);
                      }
                    }, {
                      text: '一周前',
                      onClick(picker) {
                        const date = new Date();
                        date.setTime(date.getTime() - 3600 * 1000 * 24 * 7);
                        picker.$emit('pick', date);
                      }
                    }]
                  },
                  time1:'',
                  title1:'',
                },
            infoFile:[
              {
                id:1,
                fileTitle:'河西区小学开会通知',
                fileTime:'2020-10-23',
                readNum:'4/10',
                operate:''
              },
              {
                id:2,
                fileTitle:'党员活动通知',
                fileTime:'2020-11-23',
                readNum:'8/10',
                operate:''
              },{
                id:3,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:4,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:5,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:6,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:7,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:8,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },{
                id:9,
                fileTitle:'',
                fileTime:'',
                readNum:'',
                operate:''
              },
            ],
          };
      },
      methods:{
          //表格复选框事件
        changeCheckBoxValue(val) {
          $.each(val, function (i, v) {
            if (this.infoFile.indexOf(v.id)==-1) {
              this.infoFile.push(v.id);
            }
          })
        },



        /** 新增按钮操作 */
        handleAdd() {
          this.reset();
          this.open = true;
          this.title = "添加任务";
        },
        /** 删除按钮操作 */
        handleDelete(row) {
          const jobIds = row.jobId || this.ids;
          this.$confirm('是否确认删除定时任务编号为"' + jobIds + '"的数据项?', "警告", {
            confirmButtonText: "确定",
            cancelButtonText: "取消",
            type: "warning"
          }).then(function() {
            return delJob(jobIds);
          }).then(() => {
            this.getList();
            this.msgSuccess("删除成功");
          })
        },
        //表单重置
        reset() {
          this.form = {
            jobId: undefined,
            jobName: undefined,
            jobGroup: undefined,
            invokeTarget: undefined,
            cronExpression: undefined,
            misfirePolicy: 1,
            concurrent: 1,
            status: "0"
          };
          this.resetForm("form");
        },
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
