import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {

    //What is an event?
    //An event can be thought of as something that happens.
    //To "listen" for an event, you are running some code when your bot detects that the event has occurred.

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        if (!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentRaw();
            event.getTextChannel().sendMessage("This was sent: " + messageSent).queue();
        }

    }

    @Override
    public void onChannelDelete(@NotNull ChannelDeleteEvent event) {

        String channelName = event.getChannel().getName();

        TextChannel general = event.getGuild().getTextChannelById(946147235375251501L);

        if(general != null){
            general.sendMessage("The channel: \"" + channelName + "\" was deleted.").queue();
        }

    }
}
