DESCRIPTION = "Example image demonstrating how to build SWUpdate compound image"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = "\
    file://sw-description \
    file://set_hostname.sh \
    file://check_partitions.sh \
"

# images to build before building swupdate image
IMAGE_DEPENDS = "chik-music-peer"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "chik-music-peer uImage bcm2708-rpi-zero-w-music bcm2708-rpi-zero-w-music-hifiberry-amp2 boot"

SWUPDATE_IMAGES_FSTYPES[chik-music-peer] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ""
SWUPDATE_IMAGES_NOAPPEND_MACHINE[uImage] = "1"
SWUPDATE_IMAGES_FSTYPES[bcm2708-rpi-zero-w-music] = ".dtb"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[bcm2708-rpi-zero-w-music] = "0"
SWUPDATE_IMAGES_FSTYPES[bcm2708-rpi-zero-w-music-hifiberry-amp2] = ".dtb"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[bcm2708-rpi-zero-w-music-hifiberry-amp2] = "0"
SWUPDATE_IMAGES_FSTYPES[boot] = ".scr"
SWUPDATE_IMAGES_NOAPPEND_MACHINE[boot] = "1"
