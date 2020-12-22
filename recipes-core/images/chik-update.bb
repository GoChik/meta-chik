DESCRIPTION = "Chik update package"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = "\
    file://sw-description \
"

# images to build before building swupdate image
IMAGE_DEPENDS = "chik"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "chik uImage bcm2710-rpi-3-b boot"

SWUPDATE_IMAGES_FSTYPES[chik] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ""
SWUPDATE_IMAGES_NOAPPEND_MACHINE[uImage] = "1"
SWUPDATE_IMAGES_FSTYPES[bcm2710-rpi-3-b] = ".dtb"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[bcm2710-rpi-3-b] = "1"
SWUPDATE_IMAGES_FSTYPES[boot] = ".scr"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[boot] = "1"
