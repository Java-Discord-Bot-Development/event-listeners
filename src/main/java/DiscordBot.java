import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class DiscordBot{

    public static void main(String[] args) throws LoginException {

        JDA jda = JDABuilder.createDefault("OTQ2MTg0OTM3NTc1NDI4MTE2.YhbBZA.TymZm9tugoDMN3_oIc2-lxdE6BE")
                .setActivity(Activity.listening("to your mom"))
                .addEventListeners(new BotListeners())
                .build();

    }


}
