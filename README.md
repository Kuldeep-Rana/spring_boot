# spring_boot
# In this example I have demonstrated the use of ELK stack with Springboot. 


# Apart from the Spring boot application following additional steps are required to complete the example. 

# 1. Download Elasticsearch from (https://www.elastic.co/downloads/elasticsearch) and unzip it and run elasticsearch.bat or (extension as per your operating system)

# 2. Download logstash from (https://www.elastic.co/downloads/logstash) and unzip it.
# 3. Go to the config folder and create a new logstash.conf file to define the logsath pipeline which will read the logs generated by the spring boot application and it will push them to elasticsearch.
# 4.  The complete command to run logstash is logstash.bat (or extension as per your OS) -f {path of your config file} i.e. logstash.bat -f ../config/logstash.conf
# 5. Three main components of logstash.conf file is input, filter, and output. 
# 6. Download kibana from (https://www.elastic.co/downloads/kibana) and unzip it. 
# 7. Go to the config folder and edit the kibana.yaml file, uncomment elasticsearch.hosts property and provide the URL to your elasticsearch

# You can refer to the this https://github.com/Kuldeep-Rana/spring_boot/blob/master/elkdemo/logstash.conf file 