package com.example.aiassistant

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class AssistantAccessibilityService : AccessibilityService() {
    companion object {
        var instance: AssistantAccessibilityService? = null
            private set
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}

    override fun onInterrupt() {}

    override fun onDestroy() {
        super.onDestroy()
        instance = null
    }

    fun goToHomeScreen(): Boolean {
        return performGlobalAction(GLOBAL_ACTION_HOME)
    }
}
