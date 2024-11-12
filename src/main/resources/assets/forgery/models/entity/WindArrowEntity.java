// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WindArrowEntity.json<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "windarrowentity.json"), "main");
	private final ModelPart arrow;
	private final ModelPart sworls;
	private final ModelPart swirl;
	private final ModelPart swirl2;
	private final ModelPart swirl3;

	public WindArrowEntity.json(ModelPart root) {
		this.arrow = root.getChild("arrow");
		this.sworls = root.getChild("sworls");
		this.swirl = this.sworls.getChild("swirl");
		this.swirl2 = this.sworls.getChild("swirl2");
		this.swirl3 = this.sworls.getChild("swirl3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition arrow = partdefinition.addOrReplaceChild("arrow", CubeListBuilder.create().texOffs(0, 40).addBox(0.0032F, -2.5F, -7.0F, 0.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition arrowh_r1 = arrow.addOrReplaceChild("arrowh_r1", CubeListBuilder.create().texOffs(26, 40).addBox(0.0F, -3.5F, -7.0F, 0.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9968F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition sworls = partdefinition.addOrReplaceChild("sworls", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition swirl = sworls.addOrReplaceChild("swirl", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition swirlb_r1 = swirl.addOrReplaceChild("swirlb_r1", CubeListBuilder.create().texOffs(28, 20).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition swirlt_r1 = swirl.addOrReplaceChild("swirlt_r1", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition swirls1_r1 = swirl.addOrReplaceChild("swirls1_r1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition swirl2 = sworls.addOrReplaceChild("swirl2", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -5.5F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition swirlb_r2 = swirl2.addOrReplaceChild("swirlb_r2", CubeListBuilder.create().texOffs(28, 20).addBox(0.0F, -4.0F, -5.5F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition swirlt_r2 = swirl2.addOrReplaceChild("swirlt_r2", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -4.0F, -5.5F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(0.0F, -4.0F, -5.5F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition swirls2_r1 = swirl2.addOrReplaceChild("swirls2_r1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -4.0F, -5.5F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition swirl3 = sworls.addOrReplaceChild("swirl3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition swirlb_r3 = swirl3.addOrReplaceChild("swirlb_r3", CubeListBuilder.create().texOffs(28, 20).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition swirlt_r3 = swirl3.addOrReplaceChild("swirlt_r3", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition swirls3_r1 = swirl3.addOrReplaceChild("swirls3_r1", CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -4.0F, -6.0F, 0.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		arrow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sworls.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}