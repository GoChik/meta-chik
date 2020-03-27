LINUX_VERSION ?= "4.19.108"
LINUX_RPI_BRANCH ?= "rpi-4.19.y"

require recipes-kernel/linux/linux-raspberrypi_4.19.inc

SRC_URI = "git://github.com/gochik/linux.git;branch=${LINUX_RPI_BRANCH}"
SRCREV = "5becb36dd135dee82fa5535267700cd4043455e7"

CMDLINE = "console=/dev/ttyAMA0,115200 kgdboc=ttyAMA0,115200 root=/dev/mmcblk0p2 rootfstype=ext4 rootwait"
