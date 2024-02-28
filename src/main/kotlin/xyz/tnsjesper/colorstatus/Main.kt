package xyz.tnsjesper.colorstatus

import de.miraculixx.kpaper.main.KPaper
import dev.jorel.commandapi.CommandAPI
import dev.jorel.commandapi.CommandAPIBukkitConfig
import net.kyori.adventure.text.Component
import xyz.tnsjesper.colorstatus.commands.SetColorCommand


class Main : KPaper() {

    override fun load() {
        CommandAPI.onLoad(CommandAPIBukkitConfig(this).silentLogs(true))

        server.consoleSender.sendMessage(Component.text("[ColorStatus] Load ColorStatus"))

        // Commands
        SetColorCommand()
    }

    override fun startup() {
        CommandAPI.onEnable()

    }

    override fun shutdown() {
        CommandAPI.onDisable()
        server.consoleSender.sendMessage(Component.text("[ColorStatus] Plugin disabled"))

    }
}


