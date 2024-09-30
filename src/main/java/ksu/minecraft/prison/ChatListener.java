package ksu.minecraft.prison;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {

    //Class that is used to test the functionality of MiniMessage
    @EventHandler
    public void onChat(AsyncChatEvent event){
        for(Audience viewer : event.viewers()){
            System.out.println(viewer);
        }

        TextComponent tc = (TextComponent) event.message();
        MiniMessage miniMessage = MiniMessage.miniMessage();

        //miniMessage.deserialize(tc.content());

        Component replacedText = miniMessage.deserialize(tc.content());

        event.message(replacedText);
    }
}
