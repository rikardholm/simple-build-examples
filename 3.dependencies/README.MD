cd greeter-app
mvn dependency:copy-dependencies

java -cp greeter-app/target/greeter-app-1.0.0.jar:greeter-app/target/dependency/*:greeter-domain/target/greeter-domain-3.9.0.jar x.mypackage.application.Application GRUMPY