FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# KCONFIG_MODE = "--allnoconfig"
# KBUILD_DEFCONFIG_raspberrypi = ""
# KBUILD_DEFCONFIG_raspberrypi3 = ""

SRC_URI_append = " \
    file://defconfig \
"

SRC_URI_append_rpi-0w_music = " \
    file://devtool-fragment.cfg \
    file://0001-Add-support-for-hifiberry-amps.patch \
    file://0004-Fix-hifiberry-amp2-dt.patch \
    file://0005-hifiberry-amp2-add-mute-gpio.patch \
"

SRC_URI_append_unipi-neuron = " \
    file://0001-unipi-add-spi-driver.patch \
    file://0002-unipi-add-rtc-driver.patch \
    file://0003-add-neuron-devicetree.patch \
"

#CMDLINE = "console=/dev/ttyAMA0,115200 kgdboc=ttyAMA0,115200 root=/dev/mmcblk0p2 rootfstype=ext4 rootwait"