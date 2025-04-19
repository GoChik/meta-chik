SUMMARY = "Chik image"
DESCRIPTION = "Includes all the tools required to power a smart device with chik"

IMAGE_FEATURES += " \
    read-only-rootfs \
"

LICENSE = "MIT"

IMAGE_LINGUAS = ""

inherit core-image

IMAGE_INSTALL += "\
    unipi-overlays \
    tzdata \
    avahi-daemon \
    ca-certificates \
    connman \
    connman-client \
    wireless-regdb-static \
    bluez5 \
    openssl \
    chik-client \
    \
    snapcast-server \
    shairport-sync \
"

IMAGE_BOOT_FILES += " \
    devicetree/unipi_s103-overlay.dtbo;overlays/unipi_s103-overlay.dtbo \
    devicetree/unipi_l203-overlay.dtbo;overlays/unipi_l203-overlay.dtbo \
"

# Development features
IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-dropbear \
    allow-empty-password \
"