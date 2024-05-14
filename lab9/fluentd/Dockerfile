FROM fluentd:v1.16.2-debian-1.1
USER root
RUN gem uninstall -I elasticsearch && gem install elasticsearch -v 7.17.0
RUN gem update --system && \
gem install fluent-plugin-elasticsearch --source http://rubygems.org


