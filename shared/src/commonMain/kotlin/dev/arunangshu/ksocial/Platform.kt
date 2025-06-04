package dev.arunangshu.ksocial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform