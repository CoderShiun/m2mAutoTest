package com.shiun

import com.sun.jdi.InterfaceType
import org.openqa.selenium.chrome.ChromeDriver
import java.io.FileInputStream
import java.util.*

fun setProperties(): Properties {
    val p = Properties()
    val propertiesPath = System.getProperty("user.dir")
    val propertiesFile = propertiesPath + "/src/main/resources/config.properties"

    val inputStream = FileInputStream(propertiesFile)
    p.load(inputStream)

    val driverPath = propertiesPath + "/src/main/resources/chromedriver"
    System.setProperty("webdriver.chrome.driver", driverPath)

    return p
}

fun main() {
//    driver.get("http://localhost:8080/#/login/")

    var p = setProperties()

//    val chrome = Chrome()
//    chrome.openBrowser(p.getProperty("appserver.demoaddress"))
//    chrome.logIn(p.getProperty("username"), p.getProperty("password"))

//    chrome.addNetworkServer(p.getProperty("ns.name"), p.getProperty("ns.server"))

//    chrome.delNetworkServer(p.getProperty("ns.server"))

//    chrome.addGwProfile(p.getProperty("gwp.name"), p.getProperty("gwp.channels"))

//    chrome.addSvProfile(p.getProperty("sv.name"))

//    chrome.addDvProfile(p.getProperty("dv.name"))

//    chrome.addGateway(p.getProperty("gw.name"), p.getProperty("gw.des"), p.getProperty("gw.id"))
    openBrowser(p.getProperty("appserver.demoaddress"))

    logIn(p.getProperty("username"), p.getProperty("password"))

    Add().addGateway(p.getProperty("gw.name"), p.getProperty("gw.des"), p.getProperty("gw.id"))

}