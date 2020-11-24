<template>
  <div class="app-container">

    <el-form :inline="true" :model="formInline" class="el-form--inline el-col-offset-12" >
      <el-form-item >
        <el-select v-model="formInline.formCompany" placeholder="请选择申请单位">
          <el-option label="天津河西区" value="shanghai"></el-option>
          <el-option label="天津小学" value="beijing"></el-option>
          <el-option label="河西区高级附属中学" value="beijing"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item >
        <el-input v-model="formInline.writeTime" placeholder="填表时间xxxx-xx-xx"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" >查询</el-button>
      </el-form-item>
    </el-form>

    <el-table  :data="birthdayTable" style="width: 100%" >
      <el-table-column prop="id" label="序号" width="180"></el-table-column>
      <el-table-column prop="itemEvent" label="申请事项" width="180"></el-table-column>
      <el-table-column prop="money" label="申请金额（元）" width="180"></el-table-column>
      <el-table-column prop="peopleAccount" label="人数"></el-table-column>
      <el-table-column prop="company" label="申请单位"></el-table-column>
      <el-table-column prop="applyPeople" label="申请人"></el-table-column>
      <el-table-column prop="writeTime" label="申请时间"></el-table-column>
      <el-table-column prop="operation" label="操作">
        <el-button-group>
          <el-button type="text">详情</el-button>
          <el-button type="text">同意</el-button>
          <el-button type="text">驳回</el-button>
        </el-button-group>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
    export default {
        name: "index",
      data(){
        return{
          formInline:{
            formCompany:'',
            writeTime:''
          },
          birthdayTable:''
        }
      }
    }
</script>

<style scoped>

</style>
