# connman will take care of networking and time sync
PACKAGECONFIG = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'minidebuginfo', 'coredump elfutils', '', d)} \
    binfmt \
    cgroupv2 \
    gshadow \
    hibernate \
    hostnamed \
    idn \
    ima \
    kmod \
    localed \
    logind \
    machined \
    myhostname \
    nss \
    nss-mymachines \
    nss-resolve \
    quotacheck \
    randomseed \
    resolved \
    set-time-epoch \
    sysusers \
    sysvinit \
    timedated \
    userdb \
    utmp \
    vconsole \
    wheel-group \
    zstd \
"