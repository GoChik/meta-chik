FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"

inherit systemd

PACKAGECONFIG_CONFARGS = ""

PACKAGES =+ " \
    ${PN}-sysrestart \
"

SRC_URI += " \
    file://09-swupdate-args \
    file://swupdate.cfg \
    file://sw-versions \
    file://swupdate-sysrestart.service \
    "

do_install_append() {
    install -m 0644 ${WORKDIR}/09-swupdate-args ${D}${libdir}/swupdate/conf.d/

    install -d ${D}${sysconfdir}
    install -m 644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}
    install -m 644 ${WORKDIR}/sw-versions ${D}${sysconfdir}

    install -m 644 ${WORKDIR}/swupdate-sysrestart.service ${D}${systemd_system_unitdir}
}

FILES_${PN}-sysrestart = " \
    ${systemd_system_unitdir}/swupdate-sysrestart.service \
    ${bindir}/swupdate-sysrestart \
"

SYSTEMD_PACKAGES += "${PN}-sysrestart"
SYSTEMD_SERVICE_${PN}-sysrestart = "swupdate-sysrestart.service"