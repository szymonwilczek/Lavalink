package dev.arbjerg.lavalink.api

import moe.kyokobot.koe.Koe

interface ISocketServer {
    val contextMap: Map<String, ISocketContext>
    val resumableSessions: Map<String, ISocketContext>
    val koe: Koe
}