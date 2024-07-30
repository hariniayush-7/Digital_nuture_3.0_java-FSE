package java_fse_CTS;
//NotifierDecorator.java
public abstract class NotifierDecorator implements Notifier {
 protected Notifier wrappedNotifier;

 public NotifierDecorator(Notifier notifier) {
     this.wrappedNotifier = notifier;
 }

 @Override
 public void send(String message) {
     wrappedNotifier.send(message);
 }
}

//SMSNotifierDecorator.java
 class SMSNotifierDecorator extends NotifierDecorator {
 public SMSNotifierDecorator(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     sendSMS(message);
 }

 private void sendSMS(String message) {
     System.out.println("Sending SMS with message: " + message);
 }
}

//SlackNotifierDecorator.java
class SlackNotifierDecorator extends NotifierDecorator {
 public SlackNotifierDecorator(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     sendSlack(message);
 }

 private void sendSlack(String message) {
     System.out.println("Sending Slack message: " + message);
 }
}


