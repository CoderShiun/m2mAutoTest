package com.shiun

import org.openqa.selenium.Keys
import org.openqa.selenium.interactions.Actions

class Add {
    fun addNetworkServer(name: String, server: String) {
        Thread.sleep(100)
//        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root").click()
        driver.findElementByPartialLinkText("Network-").click()
        driver.findElementByCssSelector(".MuiButton-label").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("server").click()
        driver.findElementById("server").sendKeys(server)
        driver.findElementByCssSelector(".MuiButton-label").click()
    }

    fun delNetworkServer(server: String) {
        driver.findElementByCssSelector(".MuiList-root:nth-child(1) > .MuiButtonBase-root:nth-child(1) .MuiTypography-root")
            .click()
        driver.findElementByLinkText(server).click()
//        driver.findElementByCssSelector(".jss551 > .MuiButton-label").click()
//        assert(driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().text, is("Are you sure you want to delete this network-server?"))
//        driver.switchTo().alert().accept()

    }

    fun addGwProfile(name: String, channels: String) {
        Thread.sleep(1500)

//        driver.findElementByCssSelector(".jss273:nth-child(1) > .jss226:nth-child(2) > .jss296").clear()
        driver.findElementByPartialLinkText("Gateway-").click()
        driver.findElementByPartialLinkText("CREATE").click()
//        driver.findElementByCssSelector(".jss148").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("channelsStr").click()
        driver.findElementById("channelsStr").sendKeys(channels)

//        driver.findElementByPartialLinkText("network-server").click()
        driver.findElementByCssSelector(".css-1q6k2q9-placeholder").click()
        driver.findElementById("react-select-networkServerID-option-0").click()
//        driver.findElementByPartialLinkText("Create").click()
        driver.findElementByCssSelector(".jss226:nth-child(2) > .jss559").click()
    }

    fun addSvProfile(name: String) {
        Thread.sleep(1500)
        driver.findElementByPartialLinkText("Service-").click()
        driver.findElementByPartialLinkText("CREATE").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementByCssSelector(".css-1q6k2q9-placeholder").click()
        driver.findElementById("react-select-networkServerID-option-0").click()

        driver.findElementById("drMin").click()
        driver.findElementById("drMin").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("drMin").sendKeys("1")

        driver.findElementById("drMax").click()
        driver.findElementById("drMax").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("drMax").sendKeys("1")

        driver.findElementById("devStatusReqFreq").click()
        driver.findElementById("devStatusReqFreq").sendKeys(Keys.ARROW_LEFT)
        driver.findElementById("devStatusReqFreq").sendKeys("4")

        driver.findElementById("reportDevStatusBattery").click()
        driver.findElementById("reportDevStatusMargin").click()

        var js = "window.scrollTo(0,1000)"
        driver.executeScript(js)

//        driver.findElementByCssSelector(".jss").click()
        driver.findElementById("drMax").click()
        driver.findElementById("drMax").sendKeys(Keys.TAB)
        driver.findElementById("drMax").sendKeys(Keys.ENTER)

    }

    fun addDvProfile(name: String) {
        Thread.sleep(1500)
        driver.findElementByPartialLinkText("Device-").click()
        driver.findElementByPartialLinkText("CREATE").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("networkServerID").click()
        driver.findElementById("react-select-networkServerID-option-0").click()

        driver.findElementById("macVersion").click()
        driver.findElementById("react-select-macVersion-option-1").click()

        driver.findElementById("regParamsRevision").click()
        driver.findElementById("react-select-regParamsRevision-option-1").click()

//        var pp = driver.findElementByCssSelector(".jss226:nth-child(2) .jss578").location
//        println(pp)
        Actions(driver).moveByOffset(516, 209).click().perform()
//        driver.findElementByCssSelector(".jss226:nth-child(2) .jss578").click()
        driver.findElementById("supportsJoin").click()
        driver.findElementById("supportsJoin").sendKeys(Keys.TAB)
        driver.findElementById("supportsJoin").sendKeys(Keys.ENTER)
    }

    fun addGateway(name: String, des: String, id: String) {
        Thread.sleep(1500)
        driver.findElementByPartialLinkText("Gateways").click()
        driver.findElementByPartialLinkText("CREATE").click()
        driver.findElementById("name").click()
        driver.findElementById("name").sendKeys(name)

        driver.findElementById("description").click()
        driver.findElementById("description").sendKeys(des)

        driver.findElementById("id").click()
        driver.findElementById("id").sendKeys(id)

        driver.findElementById("networkServerID").click()
        driver.findElementById("react-select-networkServerID-option-0").click()

        driver.findElementById("gatewayProfileID").click()
        driver.findElementById("react-select-gatewayProfileID-option-1").click()

        var js = "window.scrollTo(0,1000)"
        driver.executeScript(js)

//        var location = driver.findElementByCssSelector(".jss226:nth-child(2) > .jss582").location
//        println(location)

        driver.findElementById("location.altitude")
        Actions(driver).moveByOffset(1619, 1365).click().perform()
//        Actions(driver).moveByOffset(1763, 967).click().perform()
    }
}