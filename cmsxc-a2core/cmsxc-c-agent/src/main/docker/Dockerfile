FROM java:8
VOLUME /tmp
RUN mkdir -p /app
ADD cmsxc-c-agent-1.0.1.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 9021
CMD /app/runboot.sh
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezoneorg