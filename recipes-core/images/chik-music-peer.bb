SUMMARY = "Chik image"
DESCRIPTION = "Includes all the tools required to power a smart device with chik"

IMAGE_FEATURES += " \
    read-only-rootfs \
"

LICENSE = "MIT"

IMAGE_LINGUAS = ""

inherit core-image

IMAGE_INSTALL += " \
    tzdata \
    avahi-daemon \
    ca-certificates \
    connman \
    connman-client \
    openssl \
    alsa-utils \
    snapcast-client \
    swupdate \
    swupdate-www \
"

# debug tools
IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-dropbear \
    allow-empty-password \
"