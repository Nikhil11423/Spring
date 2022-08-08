SELECT `resort_details`.`id`,
    `resort_details`.`name`,
    `resort_details`.`location`,
    `resort_details`.`checkInTime`,
    `resort_details`.`checkOutTime`,
    `resort_details`.`createBy`,
    `resort_details`.`createDate`,
    `resort_details`.`updateDate`,
    `resort_details`.`owner`,
    `resort_details`.`pricePerDay`
FROM `xworkz_btm_march`.`resort_details`;

SELECT * FROM xworkz_btm_march.resort_details;
desc resort_details;