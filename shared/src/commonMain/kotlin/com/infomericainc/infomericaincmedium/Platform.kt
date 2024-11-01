package com.infomericainc.infomericaincmedium

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform