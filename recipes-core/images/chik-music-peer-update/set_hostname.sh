#! /bin/sh

hostname="music-$(cat /boot/room)"

mkdir /tmp/new_rootfs
mount -t ext4 /dev/mmcblk0p$1 /tmp/new_rootfs

echo ${hostname} > /tmp/new_rootfs/etc/hostname

umount /tmp/new_rootfs
rm -rf /tmp/new_rootfs