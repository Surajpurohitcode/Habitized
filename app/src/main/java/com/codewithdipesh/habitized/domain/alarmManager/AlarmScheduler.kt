package com.codewithdipesh.habitized.domain.alarmManager

interface AlarmScheduler {
    fun schedule(item: AlarmItem)
    fun cancel(item: AlarmItem)
}