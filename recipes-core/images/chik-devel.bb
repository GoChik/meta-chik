SUMMARY = "Chik development image"
DESCRIPTION = "Chik image with development tools"

require chik.bb

IMAGE_FEATURES_remove += " \
    read-only-rootfs \
"

IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-dropbear \
    allow-empty-password \
"
