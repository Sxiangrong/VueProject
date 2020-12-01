package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPoliceEvent;
import com.ruoyi.system.domain.SysPost;
import com.ruoyi.system.service.ISysPoliceEventService;
import com.ruoyi.system.service.ISysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/system/police")
public class SysPoliceEventController extends BaseController {

    private ISysPoliceEventService policeEventService;
    /**
     * 获取观影记录
     */
    @PreAuthorize("@ss.hasPermi('system:police:list')")
    @GetMapping("/list")
    public TableDataInfo policelist()
    {
        startPage();
        List<SysPoliceEvent> list = policeEventService.selectPoliceAll();
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('system:police:insert')")
    @GetMapping("/insert")
    public void insertpolice(SysPoliceEvent policeEvent)
    {
       policeEventService.insertPolice(policeEvent);
    }
    /**
     * 根据条件筛选记录
     */
    @PreAuthorize("@ss.hasPermi('system:police:ByKeys')")
    @GetMapping("/ByKeys")
    public TableDataInfo selectByKeys(String itemEvent,String company,String writeTime){
        startPage();
        List<SysPoliceEvent> list=policeEventService.selectPoliceByKeys(itemEvent,company,writeTime);
        return getDataTable(list);
    }
    /**
     * 同意请求
     */
    @PreAuthorize("@ss.hasPermi('system:police:agree')")
    @Log(title="观影、春秋游",businessType = BusinessType.UPDATE)
    @PutMapping("/agree")
    public AjaxResult agree(@Validated @RequestBody SysPoliceEvent policeEvent){
        policeEvent.setState("1");
        return toAjax(policeEventService.updateEvent(policeEvent));
    }
    /**
     * 拒绝请求
     */
    @PreAuthorize("@ss.hasPermi('system:police:refuse')")
    @Log(title="观影、春秋游",businessType = BusinessType.UPDATE)
    @PutMapping("/refuse")
    public AjaxResult refuse(@Validated @RequestBody SysPoliceEvent policeEvent){
        policeEvent.setState("2");
        return toAjax(policeEventService.updateEvent(policeEvent));
    }
    /**
     * 查询单一记录（详情）
     */
    @PreAuthorize("@ss.hasPermi('system:police:content')")
    @GetMapping("/content")
    public AjaxResult content(Long deptId){
        return AjaxResult.success(policeEventService.selectByDeptId(deptId));
    }

}
