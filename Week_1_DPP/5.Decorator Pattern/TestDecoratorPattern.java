package java_fse_CTS;
//TestDecoratorPattern.java
public class TestDecoratorPattern {
 public static void main(String[] args) {
     // Basic email notification
     Notifier notifier = new EmailNotifier();
     notifier.send("Hello, this is a basic email notification!");

     System.out.println();

     // Email notification with SMS
     Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
     smsNotifier.send("Hello, this is an email notification with SMS!");

     System.out.println();

     // Email notification with SMS and Slack
     Notifier slackAndSmsNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
     slackAndSmsNotifier.send("Hello, this is an email notification with SMS and Slack!");
 }
}

