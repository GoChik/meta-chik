do_deploy:append() {
    echo "dtparm=hdmi=off" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}

do_deploy:append:unipi-neuron() {
    echo "dtoverlay=unipi_s103" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}