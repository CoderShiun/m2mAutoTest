package com.shiun

import org.openqa.selenium.WebElement
import java.io.FileInputStream
import java.util.*

fun main() {
//    driver.get("http://localhost:8080/#/login/")

    val p = Properties()
    val propertiesPath = System.getProperty("user.dir")
    val propertiesFile = propertiesPath + "/src/main/resources/config.properties"

    val inputStream = FileInputStream(propertiesFile)
    p.load(inputStream)

    val driverPath = propertiesPath + "/src/main/resources/chromedriver"
    System.setProperty("webdriver.chrome.driver", driverPath)

    val chrome = Chrome()
    chrome.openBrowser(p.getProperty("appserver.demoaddress"))
//    chrome.register(p.getProperty("email"))
    chrome.logIn(p.getProperty("username"), p.getProperty("password"))

//    chrome.addNetworkServer(p.getProperty("ns.name"), p.getProperty("ns.server"))

//    chrome.delNetworkServer(p.getProperty("ns.server"))

//    chrome.addGwProfile(p.getProperty("gwp.name"), p.getProperty("gwp.channels"))

//    chrome.addSvProfile(p.getProperty("sv.name"))

    chrome.addDvProfile(p.getProperty("dv.name"))


}