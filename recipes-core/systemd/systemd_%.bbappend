# connman will take care of networking and time sync
PACKAGECONFIG_remove += " \
    networkd \
    timesyncd \
"