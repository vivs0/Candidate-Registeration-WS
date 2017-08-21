<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns="http://logging.apache.org/log4j/2.0/config" status="off" strict="true">

<Appenders>
	<Appender name="STDOUT" type="Console">
      <Layout type="PatternLayout" pattern="%d{HH:mm:ss.SSS} %highlight{%-5level}{FATAL=bg_red, ERROR=red, WARN=yellow, INFO=green, DEBUG=blue} - %msg%n"/>
	</Appender>
	
	<Appender type="Console" name="FLOW">
      <Layout type="PatternLayout" pattern="%d{HH:mm:ss.SSS} %highlight{%-5level}{ERROR=red, INFO=green, DEBUG=blue} - %highlight{%msg%n}{ERROR=red, INFO=green, DEBUG=blue}"/>
    </Appender>

</Appenders>

  <Loggers>
    <Root level="DEBUG">
      <AppenderRef ref="STDOUT"/>
    </Root>
    <Logger name="org.hibernate" level="DEBUG">
    	<AppenderRef ref="STDOUT"/>
    </Logger>
    <Logger name="org.springframework" level="DEBUG">
    	<AppenderRef ref="STDOUT"/>
    </Logger>
    <Logger name="org.springframework.context" level="DEBUG">
    	<AppenderRef ref="STDOUT"/>
    </Logger>

    <Logger name="org.candidate.ws" level="debug">
      <AppenderRef ref="FLOW"/>
    </Logger>

  </Loggers>
</Configuration>
