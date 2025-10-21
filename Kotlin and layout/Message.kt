package com.groupname.22i0776_22i1134

data class Message(
    val messageId: String = "",
    val text: String = "",
    val image: String = "", // Base64 string, to be implemented later
    val senderId: String = "",
    val timestamp: Long = 0L,
    var isSeen: Boolean = false, // For Vanish Mode
    val vanish: Boolean = false // Indicates if the message was sent in Vanish Mode
)
