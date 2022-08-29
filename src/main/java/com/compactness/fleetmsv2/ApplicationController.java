/*
 * Copyright (c) 2018, Xyneex Technologies. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * You are not meant to edit or modify this source code unless you are
 * authorized to do so.
 *
 * Please contact Xyneex Technologies, #1 Orok Orok Street, Calabar, Nigeria.
 * or visit www.xyneex.com if you need additional information or have any
 * questions.
 */
package com.compactness.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Timosamedet
 * @since Jan 30, 2022 5:05:51 PM
 */
@Controller
public class ApplicationController
{

    @GetMapping("/index")
    public String home()
    {
        return "index";
    }
    
    @GetMapping("/widgets")
    public String widgets()
    {
    	return "widgets";
    }

    @GetMapping("/components")
    public String widget()
    {
        return "components-cards";
    }

    @GetMapping("/_layout")
    public String layout()
    {
        return "_layout";
    }

    @GetMapping("/index2")
    public String index2()
    {
        return "index2";
    }

    @GetMapping("/hr")
    public String getHrIndex()
    {
        return "/hr/index";
    }

    @GetMapping("/accounts")
    public String getAccountIndex()
    {
        return "/account/index";
    }

    @GetMapping("/fleet")
    public String getFleetIndex()
    {
        return "/fleet/index";
    }

    @GetMapping("/helpdesk")
    public String getHelpDeskIndex()
    {
        return "/helpdesk/index";
    }

    @GetMapping("/payroll")
    public String getPayrollIndex()
    {
        return "/payroll/index";
    }

    @GetMapping("/parameters")
    public String getParametersIndex()
    {
        return "/parameters/index";
    }

}
