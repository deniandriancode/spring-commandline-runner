package app.commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class CommandlineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandlineRunnerApplication.class, args);
	}

    @Bean
    public String retrieveSomething() {
        return "This is something bro!";
    }

    @Bean
    public CommandLineRunner firstRun(String something) {
        return args -> {
            System.out.println(args.toString());
            System.out.println(something);
        };
    }

}
