SUMMARY = "Chik development image"
DESCRIPTION = "Chik image with development tools"

require chik.bb

EXTRA_IMAGE_FEATURES += " \
    debug-tweaks \
    ssh-server-dropbear \
    allow-empty-password \
"
