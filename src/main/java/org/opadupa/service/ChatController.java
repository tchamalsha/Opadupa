package org.opadupa.service;

import org.opadupa.service.model.Chat;
import org.opadupa.service.model.VideoChat;
import org.opadupa.service.model.VoiceChat;

public class ChatController {
    public void send(Chat chat){
        VoiceChat voiceChat=new VoiceChat();
        VideoChat videoChat=new VideoChat();
    }
}
