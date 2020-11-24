<template>
  <div  class="app-container">
    <div  class="box" >
 <!--     <setting-funds>
        <template slot="activities">
          <h5>weer</h5>
        </template>
      </setting-funds>-->
      <div class="panel-group box1" style="height: 130px" >
       <div class="header-panel" >
         <h3 style="padding-top: 15px">五必到，五必访等&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
       </div>
         <div class="panel-body" style="margin-left: 10px;">
           <div>
             <span>结婚费用 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
             <span>生育费用 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
             <span>住院费用 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
           </div>
           <div >
             <span>本人直系亲属去世费用 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
             <span>本单位退休人员去世费用 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
             <span>本单位退休会员纪念品 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元</span>
           </div>
         </div>
    </div>
      <div class="panel-group box1" style="height: 150px">
        <div class="header-panel" >
          <h3>观影、春/秋游&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div class="div2">
            <div>
              <span>电影券发放：每人每次发放金额 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>200</em>&nbsp;&nbsp;&nbsp;元</span>
            </div>
            <div >
            <span> 组织春/秋游：当人数&lt;<em>100</em>,达到总人数<em>70%</em>以上成行;当人数&lt;<em>100</em>且&gt;<em>200</em>
            达到总人数<em>65%</em>以上成行;当人数&gt;<em>200</em>达到总人数<em>60%</em>以上成行;
            </span>
            </div>
            <div>
            <span> 组织春/秋游每人餐费：早&lt;<em>20</em>元/天&nbsp;&nbsp;&nbsp;午&lt;<em>60</em>元/天,晚&lt;<em>60</em>元/天&nbsp;&nbsp;&nbsp;&nbsp;
              电影劵发放+组织春/秋游&lt;当年会费的<em>4</em>倍
            </span>
            </div>
          </div>

        </div>
      </div>
      <div class="panel-group box1" style="height: 70px" >
        <div class="header-panel" >
          <h3 >生日蛋糕券发放&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div>
            <span>每人可发放蛋糕券 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>300</em>&nbsp;&nbsp;&nbsp;元</span>
          </div>
        </div>
      </div>

      <div class="panel-group box1" style="height: 70px" >
        <div class="header-panel" >
          <h3>节日福利&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div class="div2">
            <div>
              <span>节日慰问品，每人每年发放金额 &lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>1000</em>&nbsp;&nbsp;&nbsp;元,且可使用经费&lt;当年经费的<em>45%</em></span>
            </div>
          </div>

        </div>
      </div>
      <div class="panel-group box1" style="height: 70px" >
        <div class="header-panel" >
          <h3 >恶劣天气防护&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div>
            <span> 恶劣天气防护,每人每次发放&lt;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>100</em>&nbsp;&nbsp;&nbsp;元</span>
          </div>
        </div>
      </div>
      <div class="panel-group box1" style="height: 100px" >
        <div class="header-panel" >
          <h3 >文体活动类&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div class="div2">
            <div>
              <span>奖励参加&nbsp;&lt;&nbsp;&nbsp;总人数的&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>66%</em>&nbsp;&nbsp;&nbsp;,获奖者每人可得物质奖励≤ <em>300</em> 元,参与者每人可得奖励≤ <em>100</em> 元，全年累计每人不得超过 <em>500</em>元</span>
            </div>
          </div>

        </div>
      </div>
      <div class="panel-group box1" style="height: 100px" >
        <div class="header-panel" >
          <h3>劳动竞赛&nbsp;&nbsp;<a class="el-icon-collection"></a></h3>
        </div>
        <div class="panel-body" style="margin-left: 10px;">
          <div class="div2">
            <div>
            <span>奖励范围 &lt; 参加总人数的
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em>33%</em>&nbsp;&nbsp;&nbsp;,获奖者每人可得物质奖励≤ <em>300</em> 元,参与者每人可得奖励≤ <em>100</em> 元，全年累计每人不得超过 <em>500</em>元</span>
            </div>
          </div>

        </div>
      </div>
    </div>
  </div>

</template>


<script>
  Vue.component('setting-funds',{
   template:'<div id="funds">' +
     '<slot name="five"><h3>五必到，五必访</h3></slot>' +
     '<slot name="activities"><h3>观影、春秋游类</h3></slot>'+
     '</div>'
  })

    export default {
        name: "funds",


    }
</script>

<style scoped>
  .box{
    width: 100%;
    height: 850px;
    background-color: whitesmoke;
    box-shadow:10px 10px 10px 8px gray;
    border: #1e1e1e 2px ;
  }
  div .box1{
    width:98%;
    margin: 10px;
    border-bottom: 1px solid #2a2424;

  }
  div h3{
    margin-top: 20px;
    margin-left: 15px;
    position: relative;
  }
  div h3 a{
    color: #1ab394;
  }
  div span {
    width: 400px;
    height: 20px;
    text-align: left;
    margin-top: 7px;
    margin-buttom: 7px;
    font-family: 黑体;
    font-size:18px ;
    color: #3b3838;
    float: left;

  }
  div span em{
    color: red;
  }
  .div2 div span  {
    width: 100%;
    height: 20px;
    text-align: left;
    margin-top: 5px;
    margin-button: 7px;
    font-family: 黑体;
    font-size:18px ;
    color: #3b3838;

  }
  .div2 span em{
    color: red;
  }

</style>
