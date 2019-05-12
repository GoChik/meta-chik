FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://wpa_supplicant-clean"

do_install_append() {
    install -m 600 ${WORKDIR}/wpa_supplicant-clean ${D}${sysconfdir}/wpa_supplicant.conf
}