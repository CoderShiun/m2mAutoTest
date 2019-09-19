package com.shiun

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
    chrome.openBrowser(p.getProperty("appserver.localaddress"))
    chrome.logIn(p.getProperty("username"), p.getProperty("password"))

    chrome.addNetworkServer(p.getProperty("networkserver.name"), p.getProperty("networkserver.server"))

//    chrome.delNetworkServer(p.getProperty("networkserver.server"))
}