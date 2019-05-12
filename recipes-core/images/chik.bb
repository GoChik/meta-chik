SUMMARY = "Chik image"
DESCRIPTION = "Includes all the tools required to power a smart device with chik"

IMAGE_FEATURES += " \
    read-only-rootfs \
"

LICENSE = "MIT"

IMAGE_LINGUAS = ""

inherit core-image

IMAGE_INSTALL += "\
    ${CORE_IMAGE_EXTRA_INSTALL} \
\
    packagegroup-core-boot \
    packagegroup-base-extended \
\
    tzdata \
    avahi-daemon \
    ca-certificates \
    connman \
    connman-client \
    openssl \
    systemd-analyze \
    chik-client \
"