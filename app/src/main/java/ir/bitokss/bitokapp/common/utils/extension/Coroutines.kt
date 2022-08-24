package ir.bitokss.bitokapp.common.utils.extension

import java.util.*
import kotlin.concurrent.schedule

fun doWithDelay(delay: Long, action: () -> Unit) =
    Timer( false)
        .schedule(delay) {
            action()
        }