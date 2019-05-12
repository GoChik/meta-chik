# connman will take care of networking and time sync
PKGCONFIG_remove += " \
    networkd \
    timesyncd \
"