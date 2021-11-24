package dev.tioachan.mc

import data.raid.Ultimate
import kotlinx.coroutines.launch
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.event.globalEventChannel
import net.mamoe.mirai.event.subscribeGroupMessages
import net.mamoe.mirai.utils.MiraiExperimentalApi
import net.mamoe.mirai.utils.info

object RandomUltimate : KotlinPlugin(
    JvmPluginDescription(
        id = "dev.tioachan.mc.RandomUltimate",
        name = "随机任务：绝境战",
        version = "1.0-SNAPSHOT",
    ) {
        author("Tioa")
        info("""FF14排本器之随机任务：绝境战""")
    }
) {
    @OptIn(MiraiExperimentalApi::class)
    override fun onEnable() {
        logger.info { "当前服务器繁忙，需要排队进行登录，请耐心等待。 " }
        logger.info { "（当前排队人数：11451419198人）" }
        globalEventChannel().subscribeGroupMessages {
            case("随机任务：绝境战"){
                var randomUltimate = Ultimate.randomUltimate
                subject.sendMessage("醒醒，排到本了，是${randomUltimate}<se.1>")
                subject.sendMessage("醒醒，排到本了，是${randomUltimate}<se.1>")
                subject.sendMessage("醒醒，排到本了，是${randomUltimate}<se.1>")
            }
        }
    }

}